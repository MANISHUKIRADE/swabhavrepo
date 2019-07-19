import { NgModule, Component } from "@angular/core";
import { RouterModule } from '@angular/router';
import { routes } from './routs';


@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
export class RoutingModule { }
