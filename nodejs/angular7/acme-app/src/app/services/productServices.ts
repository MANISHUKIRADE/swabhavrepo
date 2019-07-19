import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';



@Injectable()
export class ProductService{
     ProductList;
    configUrl = 'assets/products.jsonx';
    constructor ( private http:HttpClient){}
    getProduct():Promise<any>{
        return new  Promise((resolve,reject)=>{
            this.http.get(this.configUrl)
            .toPromise()
            .then((result)=>{
                this.ProductList=result;
                resolve(result)
            })
            .catch((error)=>{

                reject(error)
            })
        })
    }

    getProductDetails(id){
        var product;
        for(var index=0;index<this.ProductList.length;index++){
            if(id==this.ProductList[index].productId){
                product=this.ProductList[index]
                break;
            }
        }
        return product;
    }
}