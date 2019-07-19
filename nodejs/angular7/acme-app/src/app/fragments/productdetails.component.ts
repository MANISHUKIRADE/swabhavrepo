import { Component, Input } from "@angular/core";
import { ProductService } from '../services/productServices';
import { ActivatedRoute } from '@angular/router';
import { Router } from '@angular/router';


@Component({
    templateUrl: 'productdetails.component.html'
})
export class ProductDetailsPrinter {

    product;
    constructor(private service: ProductService, private route: ActivatedRoute, private router: Router) {

        var id = this.route.snapshot.params.id
        this.product = this.service.getProductDetails(id)
    }

    backToList() {
        this.router.navigateByUrl('/productlist');
    }




}