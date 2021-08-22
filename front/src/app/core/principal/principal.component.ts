import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})
export class PrincipalComponent implements OnInit {
  @Output() screenSelected = new EventEmitter<string>();

  ngOnInit(){

  }

  onSelect(feature : string){
    this.screenSelected.emit(feature);
  }
}
