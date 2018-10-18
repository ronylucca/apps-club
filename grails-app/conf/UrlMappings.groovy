class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}

//    "/$tipoNegocio/$perfil?/$tipoImovel?/$cidade?/$bairro?/$salas?/"{
//        controller = "busca"
//        action = "busca"
//        constraints {
//            perfil(matches: "((C|c)omercial)")
//        }
//    }
}
