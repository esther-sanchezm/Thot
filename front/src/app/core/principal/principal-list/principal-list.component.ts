import { Component, OnInit } from '@angular/core';
import { Row } from '../../../shared/table/row/row.component';


@Component({
  selector: 'principal-list',
  templateUrl: './principal-list.component.html',
  styleUrls: ['./principal-list.component.css']
})
export class PrincipalListComponent implements OnInit {
  title = 'Race';

  columns: Row[];
  ngOnInit(){

  }
}
