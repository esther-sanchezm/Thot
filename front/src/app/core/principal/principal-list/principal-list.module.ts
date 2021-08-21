import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { PrincipalListComponent } from './principal-list.component';


@NgModule({
  declarations: [
    PrincipalListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [PrincipalListComponent]
})
export class PrincipalListModule { }
