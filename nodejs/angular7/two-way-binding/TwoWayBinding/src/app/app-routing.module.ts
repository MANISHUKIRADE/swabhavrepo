import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ToggleButton } from './button/button.component';


const routes: Routes = [{
  path: 'togglebutton' , component : ToggleButton
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
