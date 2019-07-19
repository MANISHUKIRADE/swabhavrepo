import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { WelcomeComponent } from './welcome.component';
import { RoutingModule } from './routing.config';
import { Home } from './fragments/home.component';
import { About } from './fragments/about.component';
import { Career } from './fragments/careers.component';

@NgModule({
  declarations: [
    WelcomeComponent,
    Home,
    About,
    Career
  ],
  imports: [
    BrowserModule,
    RoutingModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})




export class AppModule { }
