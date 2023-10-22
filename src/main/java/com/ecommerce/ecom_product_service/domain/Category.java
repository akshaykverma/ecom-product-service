package com.ecommerce.ecom_product_service.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "CATEGORY")
public class Category {

	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(name = "category_id", length = 36, columnDefinition = "varchar", updatable = false, nullable = false )
	private UUID id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products = new ArrayList<>();
	
}
