export class RaceSimpleElement {
    public name: string;
    public description: string; 
    public imagePath: string;
    public content: RaceContentElement;
    
    constructor(name: string, description: string, imagePath: string){
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
    }
}
export class RaceDetailElement {
    public name: string;
    public description: string; 
    public history: string;
    public appearence: string;
    public imagePath: string;
    public content: RaceContentElement;
    
    constructor(name: string, description: string, history: string, appearence: string, imagePath: string){
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.appearence = appearence;
        this.history = history;
    }
}

export class RaceContentElement{
    public key: string;
    public value: string;

    constructor(key: string, value: string){
        this.key = key;
        this.value = value;
    }
}