import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Welcome } from './fragments/welcome.component';
import { ProductList } from './fragments/productlist.component';
import { ProductService } from './services/productServices';
import { HttpClientModule } from '@angular/common/http';
import { StarButton } from './fragments/star.component';
import { FilterPipe } from './fragments/search.pipe';
import {FormsModule } from '@angular/forms';
import { ProductDetailsPrinter } from './fragments/productdetails.component';
;


@NgModule({
  declarations: [
    AppComponent,
    Welcome,
    ProductList,
    StarButton,
    FilterPipe,
    ProductDetailsPrinter
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
