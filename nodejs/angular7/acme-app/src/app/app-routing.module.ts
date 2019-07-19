import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Welcome } from './fragments/welcome.component';
import { ProductList } from './fragments/productlist.component';
import { ProductDetailsPrinter } from './fragments/productdetails.component';



const routes: Routes = [{
  path: 'home' , component: Welcome
},
{
  path:"", component:Welcome
},{
  path:"productlist" ,component:ProductList
},{
  path:"productdetials/:id",component: ProductDetailsPrinter
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
