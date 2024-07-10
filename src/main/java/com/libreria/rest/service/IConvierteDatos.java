package com.libreria.rest.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
