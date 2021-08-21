import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'principal',
  templateUrl: './principal.component.html',
  styleUrls: ['./principal.component.css']
})
export class PrincipalComponent implements OnInit {
  title : string = 'Thot';
  description : string = 'Application to create lore of fantasy';

  ngOnInit(){

  }
}
