import { Component } from "@angular/core";

@Component({
    selector: 'principal-header',
    templateUrl: './principal-header.component.html'
})
export class PrincipalHeaderComponent {
    title : string = 'Thot';
    description : string = 'Thot is a simple application to management your own lore of fantasy adventure. You could use that for videogame, novel or maybe only for fun. . .';
}