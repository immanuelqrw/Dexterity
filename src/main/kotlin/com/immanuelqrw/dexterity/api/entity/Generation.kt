package com.immanuelqrw.dexterity.api.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.immanuelqrw.core.entity.BaseUniqueEntity
import com.immanuelqrw.dexterity.api.dto.output.Generation as GenerationOutput
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "Generation")
data class Generation(

    @Column(name = "ordinal", unique = true, nullable = false)
    val ordinal: Int,

    @Column(name = "name", unique = true, nullable = false)
    val name: String

) : BaseUniqueEntity() {

    val output: GenerationOutput
        get() {
            return GenerationOutput(
                ordinal = ordinal,
                name = name
            )
        }

}
