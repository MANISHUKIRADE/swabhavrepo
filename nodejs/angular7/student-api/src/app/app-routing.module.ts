import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Home } from './fragments/home.component';
import { AddStudent } from './fragments/add.component';
import { EditStudent } from './fragments/edit.component';


const routes: Routes = [{
  path:"home" , component:Home
},{
  path:"",component:Home
},{
  path:"add", component:AddStudent
},{
  path:"edit/:id" , component:EditStudent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
