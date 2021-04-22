import { Schema } from "mongoose";

const DebitoSchema = new Schema({
    nome: {
        type: String,
        required: [true, "O campo nome do débito é obrigatório!"],
    },
    valor: {
        type: Number,
        min: [0, "Valor mínimo de R$ 1,00"],
        required: [true, "O campo valor do débito é obrigatório"],
    },
    status: {
        type: String,
        enum: ["PAGO", "AGENDADO", "PENDENTE"],
        uppercase: true,
    },
},
    {
        timestamps: true,
    }
);

export { DebitoSchema };
