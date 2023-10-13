package com.bicho.bet.bicho.bet.models.jogo;

import com.bicho.bet.bicho.bet.enums.StatusJogo;
import com.bicho.bet.bicho.bet.enums.TipoAposta;
import com.bicho.bet.bicho.bet.models.conta.Loterica;
import com.bicho.bet.bicho.bet.models.core.EntityId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Jogo extends EntityId {
    @ManyToOne
    @JoinColumn(name = "loterica_id")
    private Loterica loterica;

    @Column(name = "dt_inicio")
    private LocalDateTime dataInicio;

    @Column(name = "dt_fim")
    private LocalDateTime dataFim;

    @Column(name = "valor_acumulado")
    private Double valorAcumulado;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusJogo status;

    public Jogo(Loterica loterica, LocalDateTime dataInicio, LocalDateTime dataFim) {
        this.loterica = loterica;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
