package me.chong.orchestration.to;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApplicationTO {

    private String groupTag;

    private String spaceName;

    private String serviceName;

    private Integer k8s;

    private String status;
}
