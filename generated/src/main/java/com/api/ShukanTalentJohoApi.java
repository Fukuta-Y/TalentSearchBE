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

import com.model.ShukanTalentJoho;

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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-12T21:30:49.581521+09:00[Asia/Tokyo]")
@Validated
@Tag(name = "shukanTalentJoho", description = "the shukanTalentJoho API")
@RequestMapping("api")
public interface ShukanTalentJohoApi {

    /**
     * GET /shukanTalentJoho : １週間においてのタレントごとの情報を返す
     * １週間においてのタレントごとの情報を返す
     *
     * @param targetNentsuki  (required)
     * @param targetShu  (required)
     * @param talentName  (optional)
     * @return １週間においてのタレントごとの情報を正常取得 (status code 200)
     */
    @Operation(
        operationId = "getShukanTalentJoho",
        summary = "１週間においてのタレントごとの情報を返す",
        tags = { "shukanTalentJoho" },
        responses = {
            @ApiResponse(responseCode = "200", description = "１週間においてのタレントごとの情報を正常取得", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ShukanTalentJoho.class))
            })
        }
    )
    @GetMapping("/shukanTalentJoho")
    ResponseEntity<ShukanTalentJoho> getShukanTalentJoho(
        @NotNull @Min(199001) @Max(210012) @Parameter(name = "targetNentsuki", description = "", required = true) @Valid @RequestParam(value = "targetNentsuki", required = true) Integer targetNentsuki,
        @NotNull @Min(1) @Max(5) @Parameter(name = "targetShu", description = "", required = true) @Valid @RequestParam(value = "targetShu", required = true) Integer targetShu,
        @Size(max = 30) @Parameter(name = "talentName", description = "") @Valid @RequestParam(value = "talentName", required = false) String talentName
    );

}
