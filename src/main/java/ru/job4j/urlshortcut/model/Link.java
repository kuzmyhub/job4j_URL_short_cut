package ru.job4j.urlshortcut.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "links")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private int id;

    @Column(name = "url")
    private String url;

    @Column(name = "code")
    private String code;

    @Column(name = "total")
    private int total = 0;

    @ManyToOne
    @JoinColumn(name = "site_id")
    private Site site;
}
