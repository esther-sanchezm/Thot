import { Component, OnInit } from '@angular/core';
import { LoreElement } from '../principal.model';


@Component({
  selector: 'principal-list',
  templateUrl: './principal-list.component.html',
  styleUrls: ['./principal-list.component.css']
})
export class PrincipalListComponent implements OnInit {

  elementsLore: LoreElement[] = [
    new LoreElement('Race','Different types of creatures of the lore','https://geekandsundry.com/wp-content/uploads/2016/03/scag_header-970x544.jpg'),
    new LoreElement('Magic','Different types of creatures of the lore','https://i0.wp.com/www.tor.com/wp-content/uploads/2015/06/stormlight.jpg?type=vertical&quality=100'),
    new LoreElement('Character','Different types of creatures of the lore','https://assets.dicebreaker.com/dunegeons-and-dragons-essentials-kit-artwork.jpg/BROK/resize/1920x1920%3E/format/jpg/quality/80/dunegeons-and-dragons-essentials-kit-artwork.jpg'),
    new LoreElement('Places','Different types of creatures of the lore','https://1.bp.blogspot.com/-AxjPJE5EwFU/X5tgEI_G0RI/AAAAAAAACw0/0F9zxV_fnpsdY_F4Q3VB9WZaoJjoY8v3ACLcBGAsYHQ/s1000/Castle_Naeytar-5e.jpg'),    
    new LoreElement('Map','Different types of creatures of the lore','https://images.squarespace-cdn.com/content/v1/5bd0d577755be21b6c237d35/1573575587168-SUU6UPPS7JO5V8K93S6Y/wonderdraft.JPG?format=500w'),
  ];

  ngOnInit(){

  }
}
