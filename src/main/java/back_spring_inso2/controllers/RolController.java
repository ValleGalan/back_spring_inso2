package back_spring_inso2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rol")
public class RolController {
    
}
/*
DESDE EL CONTROLADOR O EL OTRO DE ABAJO
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;
    private final RolRepository rolRepository;

    @Autowired
    public UsuarioController(UsuarioRepository usuarioRepository, RolRepository rolRepository) {
        this.usuarioRepository = usuarioRepository;
        this.rolRepository = rolRepository;
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearUsuarioConRol(@RequestBody Usuario usuario) {
        // Primero, guardamos el usuario
        usuarioRepository.save(usuario);
        
        // Creamos un rol y lo asociamos al usuario
        Rol rol = new Rol();
        rol.setNombre("secretario"); // o "administrador" según corresponda
        rol.setUsuario(usuario);
        rolRepository.save(rol);
        
        return ResponseEntity.ok("Usuario creado con rol asignado.");
    }
}

//SERVICO Y CONTROLADOR:
@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final RolRepository rolRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository, RolRepository rolRepository) {
        this.usuarioRepository = usuarioRepository;
        this.rolRepository = rolRepository;
    }

    public Usuario crearUsuarioConRol(String nombre, String email, String nombreRol) {
        // Crear y guardar el usuario
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuarioRepository.save(usuario);

        // Crear y guardar el rol
        Rol rol = new Rol();
        rol.setNombre(nombreRol);
        rol.setUsuario(usuario);
        rolRepository.save(rol);

        return usuario;
    }
}


---DESPUES USO EL SERVICO EN EL CONTROLADOR
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearUsuarioConRol(@RequestBody CrearUsuarioRequest request) {
        Usuario usuario = usuarioService.crearUsuarioConRol(request.getNombre(), request.getEmail(), request.getNombreRol());
        return ResponseEntity.ok("Usuario creado con rol asignado.");
    }
}


*/