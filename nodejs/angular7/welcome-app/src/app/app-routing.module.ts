import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ToggleButton } from './button/button.component';
import { AppComponent } from './welcome/welcome.component';
import { StarButton } from './starcomponent/star.component';
import { NumberApi } from './numbersApi/numberapi.component';


const routes: Routes = [{
  path: "ToggleButton" , component:  ToggleButton,
},
{
  path: "StarButton" , component: StarButton,
},{
  path:" " , component: NumberApi,
},
/*{
  path:"",component: AppComponent
}*/];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
