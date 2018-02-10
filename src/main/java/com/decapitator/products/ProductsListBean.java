package com.decapitator.products;

import com.decapitator.products.domain.ProductEntity;
import sun.security.x509.PrivateKeyUsageExtension;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class ProductsListBean implements Serializable {
    @EJB
    private ProductsManagetEJB productsManagetEJB;


    @Inject
    private ExampleBean exampleBean;


    private Product newProduct = new Product();

    private long idForDelete;

    private Product editingProduct;

    public ProductsManagetEJB getProductsManagetEJB() {
        return productsManagetEJB;
    }

    public void setProductsManagetEJB(ProductsManagetEJB productsManagetEJB) {
        this.productsManagetEJB = productsManagetEJB;
    }

    public Product getEditingProduct() {
        return editingProduct;
    }

    public void setEditingProduct(Product editingProduct) {
        this.editingProduct = editingProduct;
    }

    public long getIdForDelete() {
        return idForDelete;
    }

    public void setIdForDelete(long idForDelete) {
        this.idForDelete = idForDelete;
    }

    public List<Product> getProductList(){
    return  productsManagetEJB.readList(0,100);
    }

    public Product getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Product product) {
        this.newProduct = product;
    }
    public void createNewProduct(){
        productsManagetEJB.create(newProduct);
        newProduct = new Product();
    }
    public void deleteProduct(){
        productsManagetEJB.delete(idForDelete);
      }
      public void saveProducts(){
        productsManagetEJB.update(editingProduct);
      }
}
