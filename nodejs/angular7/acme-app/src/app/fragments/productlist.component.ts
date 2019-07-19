import { Component } from "@angular/core";
import { ProductService } from '../services/productServices';

@Component({
    templateUrl: 'productlist.component.html'
})
export class ProductList{
    ProductList=[];
    product_for_details =null;
    imageshow:boolean= false
    searchText:string;
    constructor( private service: ProductService){
         service.getProduct()
         .then((result)=>{
             this.ProductList=result
         })
         .catch((error)=>{
             console.log(error)
         })
    }
    hideImage(){
        this.imageshow=true
    }
    showImage(){
        this.imageshow=false
    }
   
}