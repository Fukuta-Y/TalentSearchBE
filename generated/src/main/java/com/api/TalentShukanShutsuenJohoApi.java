/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.TalentShukanShutsuenJoho;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-11T23:29:51.001355+09:00[Asia/Tokyo]")
@Validated
@Tag(name = "TalentShukanShutsuenJoho", description = "the TalentShukanShutsuenJoho API")
@RequestMapping("${openapi..base-path:}")
public interface TalentShukanShutsuenJohoApi {

    /**
     * GET /TalentShukanShutsuenJoho : タレントにおいての１週間ごとの情報を返す
     * タレントにおいての１週間ごとの情報を返す
     *
     * @param nentsuki  (required)
     * @param shu  (required)
     * @param talentId  (required)
     * @return タレントにおいての１週間ごとの情報を正常取得 (status code 200)
     */
    @Operation(
        operationId = "getTalentShukanShutsuenJoho",
        summary = "タレントにおいての１週間ごとの情報を返す",
        tags = { "TalentShukanShutsuenJoho" },
        responses = {
            @ApiResponse(responseCode = "200", description = "タレントにおいての１週間ごとの情報を正常取得", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TalentShukanShutsuenJoho.class))
            })
        }
    )
    @GetMapping("/TalentShukanShutsuenJoho")
    ResponseEntity<TalentShukanShutsuenJoho> getTalentShukanShutsuenJoho(
        @NotNull @Min(199001) @Max(210012) @Parameter(name = "nentsuki", description = "", required = true) @Valid @RequestParam(value = "nentsuki", required = true) Integer nentsuki,
        @NotNull @Min(1) @Max(5) @Parameter(name = "shu", description = "", required = true) @Valid @RequestParam(value = "shu", required = true) Integer shu,
        @NotNull @Size(max = 8) @Parameter(name = "talentId", description = "", required = true) @Valid @RequestParam(value = "talentId", required = true) String talentId
    );

}
