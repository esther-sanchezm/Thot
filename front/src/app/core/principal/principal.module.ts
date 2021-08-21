import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { PrincipalComponent } from './principal.component';
import { HeaderComponent } from '../../shared/header/header.component';

@NgModule({
  declarations: [
    PrincipalComponent, 
    HeaderComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [PrincipalComponent]
})
export class PrincipalModule { }
