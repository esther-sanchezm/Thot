import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { PrincipalComponent } from './principal.component';
import { PrincipalHeaderComponent } from './principal-header/principal-header.component';
import { PrincipalListComponent } from './principal-list/principal-list.component';




@NgModule({
  declarations: [
    PrincipalComponent, 
    PrincipalHeaderComponent,
    PrincipalListComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [PrincipalComponent]
})
export class PrincipalModule { }
