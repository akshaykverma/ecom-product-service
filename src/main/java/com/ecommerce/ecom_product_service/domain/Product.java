package com.ecommerce.ecom_product_service.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product extends Auditable {

	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(name = "product_id", length = 36, columnDefinition = "varchar", updatable = false, nullable = false )
	private UUID id;
	
	/**
	 * Used for optimistic locking with a database record
	 */
	@Version
    private Long version;
	
	private String name;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	private Double price;
	
	@OneToMany(mappedBy = "product")
	private List<Seller> sellers = new ArrayList<>(); 
	
}
