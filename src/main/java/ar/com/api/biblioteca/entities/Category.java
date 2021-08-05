package ar.com.api.biblioteca.entities;

import javax.persistence.*;;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "category_id")
    private Integer category_id;

    private String description;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
}
