package com.hotel.reservahabitaciones.Model.DTOs;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservacionDTO {
     Long id;
     LocalDate fechaEntrada;
     LocalDate fechaSalida;
     Long idCliente;
     List<Long>ids;
}
