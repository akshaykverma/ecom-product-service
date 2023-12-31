package com.ecommerce.ecom_product_service.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
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
	@Column(name = "version", nullable = false )
    private Long version;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	// Identifies each product uniquely. Can be used for inventory system
	@Column(name = "upc", unique = true)
	private String upc;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@Column(name = "price", nullable = false)
	private Double price;
	
	@ManyToMany
    @JoinTable(
        name = "product_seller",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "seller_id")
    )
	private Set<Seller> sellers = new HashSet<>(); 
	
}
