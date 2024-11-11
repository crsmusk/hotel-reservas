package com.hotel.reservahabitaciones.Service.Interface;

import com.hotel.reservahabitaciones.Model.DTOs.ClienteDTO;
import com.hotel.reservahabitaciones.Model.DTOs.EmpleadoDTO;
import com.hotel.reservahabitaciones.Model.DTOs.RolDTO;
import com.hotel.reservahabitaciones.Model.DTOs.UsuarioDTO;

import java.util.List;

public interface IUsuario {
    public List<UsuarioDTO> getAll();
    public UsuarioDTO getById(Long id);
    public UsuarioDTO getByEmail(String email);
    public void save(UsuarioDTO usuarioDTO);
    public UsuarioDTO update(Long id,UsuarioDTO usuarioDTO);
    public void delete(Long id);
    public void registrarCliente(ClienteDTO clienteDTO);
    public void registrarEmpleado(EmpleadoDTO EmpleadoDTO);
    public void actualizarContraseña(String email,String contraseñaNueva);
    public void actualizarRoles(Long id, List<RolDTO>roles);
}
