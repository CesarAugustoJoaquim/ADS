import { Router, Request, Response} from "express";

const router = Router();

router.get("/teste", (request: Request, response: Response) => {
    response.send("Criamos o arquivo de configuração de rotas.");
});

export { router };
