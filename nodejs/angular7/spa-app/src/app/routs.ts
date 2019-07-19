import { Routes } from "@angular/router";
import { Home } from './fragments/home.component';
import { About } from './fragments/about.component';
import { Career } from './fragments/careers.component';

export const routes:Routes =[{
    path:"home", component:Home 
},{
    path:"about",component:About
},{
    path:'career',component:Career
},{
path:'', component:Home
}]