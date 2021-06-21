import { Component, OnInit } from '@angular/core';
import { Ciclo } from 'src/app/models/Ciclo';
import { CicloService } from 'src/app/services/ciclo.service';

@Component({
  selector: 'app-cadastrar',
  templateUrl: './cadastrar.component.html',
  styleUrls: ['./cadastrar.component.css']
})
export class CadastrarComponent implements OnInit {

  ciclo: Ciclo = new Ciclo();
  campo: string = "";

  constructor(private service: CicloService) { }

  ngOnInit(): void {
  }

  cadastrar(): void{
    this.service.cadastrar(this.ciclo).subscribe((ciclo) => {
      console.log(ciclo);
    })
  }

}
