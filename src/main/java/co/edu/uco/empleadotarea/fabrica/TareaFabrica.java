package co.edu.uco.empleadotarea.fabrica;


import co.edu.uco.empleadotarea.command.TareaCommand;
import co.edu.uco.empleadotarea.entity.TareaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TareaFabrica {

    public List<TareaCommand> entityToCommand(List<TareaEntity> listaTareaEntity){
        List<TareaCommand> listaTareaCommand= new ArrayList<>();
        listaTareaEntity.forEach(t->listaTareaCommand.add(entityToCommand(t)));
        return listaTareaCommand;
    }

    private TareaCommand entityToCommand(TareaEntity tareaEntity){
        TareaCommand tareaCommand= new TareaCommand();
        tareaCommand.setIdTarea(tareaEntity.getIdTarea());
        tareaCommand.setNombreTarea(tareaEntity.getNombreTarea());
        tareaCommand.setDescripcionTarea(tareaEntity.getDescripcionTarea());
        tareaCommand.setActivo(tareaEntity.isActivo());
        return tareaCommand;
    }
}
