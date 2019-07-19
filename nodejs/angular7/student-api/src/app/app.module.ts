import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentService } from './services/student.service';
import { Home } from './fragments/home.component';
import { HttpClientModule } from '@angular/common/http';
import { AddStudent } from './fragments/add.component';
import {FormsModule} from '@angular/forms'
import { from } from 'rxjs';
import { EditStudent } from './fragments/edit.component';
import { genderfilter } from './custpipe/ismale.pipe';


@NgModule({
  declarations: [
    AppComponent,
    Home,
    AddStudent,
    EditStudent,
    genderfilter
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
    
    
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
