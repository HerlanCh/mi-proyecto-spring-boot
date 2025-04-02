package com.universidad.service; // Define el paquete al que pertenece esta interfaz

import com.universidad.dto.EstudianteDTO; // Importa la clase EstudianteDTO del paquete dto

import java.util.List; // Importa la interfaz List para manejar listas

public interface IEstudianteService { // Define la interfaz IEstudianteService
    //Metodo para obtener todos los estudiantes
    List<EstudianteDTO> obtenerTodosLosEstudiantes();
    //Metodo para obtener un Estudiante mediante su Id
    EstudianteDTO obtenerEstudiantePorId(Long id);
    //Metodo para actualizar un estudiante por su Id
    EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO);
    //Metodo para registrar a un estudiante nuevo
    EstudianteDTO registrarEstudiante(EstudianteDTO estudianteDTO);
    //Metodo para eliminar a un estudiante mediante su Id
    void eliminarEstudiante(Long id);
}