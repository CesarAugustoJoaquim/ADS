import { Component, OnInit } from '@angular/core';
import { Ciclo } from 'src/app/models/Ciclo';
import { CicloService } from 'src/app/services/ciclo.service';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {

  ciclos: Ciclo[] = [];

  constructor(private service: CicloService) { }

  ngOnInit(): void {
    this.service.listar().subscribe((ciclos) => {
      this.ciclos = ciclos;
    })
  }

}
