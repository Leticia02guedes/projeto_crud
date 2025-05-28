function Formulario({botao, eventoTeclado, cadastrar, obj, cancelar, remover, alterar}){
    return(
        <form>

            <h2>Sistema Gestor de Produtos</h2>

            <input type="text" value={obj.nome} placeholder="Nome" onChange={eventoTeclado} name="nome" className="form-control"/>
            <input type="text" value={obj.marca} placeholder="Marca" onChange={eventoTeclado} name="marca" className="form-control"/>

            {
               botao
                ?
                <button className="btn btn-success" type="button" onClick={cadastrar}>
                    <i class="bi bi-plus"></i> Cadastrar
                </button>
                :
                <div>
                    <button className="btn btn-warning" type="button" onClick={cancelar} value="Cancelar" >
                        <i class="bi bi-x-circle-fill"></i> Cancelar
                    </button>
                    <button className="btn btn-primary" type="button" onClick={alterar} value="Alterar" >
                        <i class="bi bi-pen-fill"></i> Alterar
                    </button>
                    <button className="btn btn-danger"  type="button" onClick={remover} value="Remover" >
                        <i class="bi bi-trash2-fill"></i> Remover
                    </button>
                </div>
            }
            
        </form>
    )
}

export default Formulario;