import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './welcome/welcome.component';
import { StudentComponent } from './welcome/student.component';
import { ToggleButton } from './button/button.component'
import { StarButton } from './starcomponent/star.component';
import { NumberApi } from './numbersApi/numberapi.component';
import { httpNumService } from './numbersApi/numberapi.httpNumService';
import { HttpClientModule, HttpClient } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    ToggleButton,
    StarButton,
    NumberApi
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [httpNumService],

  bootstrap: [NumberApi]
})
export class AppModule { }
