# Semana Spring Boot

## Controller

- **Paginação (Pageable)**, método para listar os 20 primeiros itens da lista

```Java
@GetMapping
public Page<Sale> findSales(Pageable pageable){
return saleService.findSales(pageable);
}
```
## Consulta por data

### Consulta customizada:
```SQL
@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);
```