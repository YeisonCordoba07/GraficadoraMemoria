systeminfo | out-file -FilePath InformacionDelSistema.txt
select-string "Memoria f¡sica disponible" InformacionDelSistema.txt | out-file -FilePath MemoriaLibre.txt
select-string "Cantidad total" InformacionDelSistema.txt | out-file -FilePath MemoriaTotal.txt
clear
type MemoriaLibre.txt
type MemoriaTotal.txt