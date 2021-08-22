export class RaceElement {
    public name: string;
    public description: string; 
    public imagePath: string;
    public content: ContentElement;
    
    constructor(name: string, description: string, imagePath: string){
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
    }
}

export class ContentElement{
    public key: string;
    public value: string;

    constructor(key: string, value: string){
        this.key = key;
        this.value = value;
    }
}