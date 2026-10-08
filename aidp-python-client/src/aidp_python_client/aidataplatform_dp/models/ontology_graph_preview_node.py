# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPreviewNode(object):
    """
    Graph node in a design-time ontology preview.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPreviewNode object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OntologyGraphPreviewNode.
        :type id: str

        :param iri:
            The value to assign to the iri property of this OntologyGraphPreviewNode.
        :type iri: str

        :param compact_iri:
            The value to assign to the compact_iri property of this OntologyGraphPreviewNode.
        :type compact_iri: str

        :param label:
            The value to assign to the label property of this OntologyGraphPreviewNode.
        :type label: str

        :param properties:
            The value to assign to the properties property of this OntologyGraphPreviewNode.
        :type properties: list[oci.aidataplatform_dp.models.OntologyGraphPreviewProperty]

        :param kind:
            The value to assign to the kind property of this OntologyGraphPreviewNode.
        :type kind: str

        :param expansion:
            The value to assign to the expansion property of this OntologyGraphPreviewNode.
        :type expansion: oci.aidataplatform_dp.models.OntologyGraphPreviewNodeExpansion

        """
        self.swagger_types = {
            'id': 'str',
            'iri': 'str',
            'compact_iri': 'str',
            'label': 'str',
            'properties': 'list[OntologyGraphPreviewProperty]',
            'kind': 'str',
            'expansion': 'OntologyGraphPreviewNodeExpansion'
        }

        self.attribute_map = {
            'id': 'id',
            'iri': 'iri',
            'compact_iri': 'compactIri',
            'label': 'label',
            'properties': 'properties',
            'kind': 'kind',
            'expansion': 'expansion'
        }

        self._id = None
        self._iri = None
        self._compact_iri = None
        self._label = None
        self._properties = None
        self._kind = None
        self._expansion = None

    @property
    def id(self):
        """
        **[Required]** Gets the id of this OntologyGraphPreviewNode.

        :return: The id of this OntologyGraphPreviewNode.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OntologyGraphPreviewNode.

        :param id: The id of this OntologyGraphPreviewNode.
        :type: str
        """
        self._id = id

    @property
    def iri(self):
        """
        Gets the iri of this OntologyGraphPreviewNode.
        Full IRI for ontology entity nodes. Present only when the node represents an ontology entity.


        :return: The iri of this OntologyGraphPreviewNode.
        :rtype: str
        """
        return self._iri

    @iri.setter
    def iri(self, iri):
        """
        Sets the iri of this OntologyGraphPreviewNode.
        Full IRI for ontology entity nodes. Present only when the node represents an ontology entity.


        :param iri: The iri of this OntologyGraphPreviewNode.
        :type: str
        """
        self._iri = iri

    @property
    def compact_iri(self):
        """
        Gets the compact_iri of this OntologyGraphPreviewNode.
        Compact QName identifier for ontology entity nodes, such as ex:Customer. Present only when the node represents an ontology entity.


        :return: The compact_iri of this OntologyGraphPreviewNode.
        :rtype: str
        """
        return self._compact_iri

    @compact_iri.setter
    def compact_iri(self, compact_iri):
        """
        Sets the compact_iri of this OntologyGraphPreviewNode.
        Compact QName identifier for ontology entity nodes, such as ex:Customer. Present only when the node represents an ontology entity.


        :param compact_iri: The compact_iri of this OntologyGraphPreviewNode.
        :type: str
        """
        self._compact_iri = compact_iri

    @property
    def label(self):
        """
        **[Required]** Gets the label of this OntologyGraphPreviewNode.

        :return: The label of this OntologyGraphPreviewNode.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """
        Sets the label of this OntologyGraphPreviewNode.

        :param label: The label of this OntologyGraphPreviewNode.
        :type: str
        """
        self._label = label

    @property
    def properties(self):
        """
        **[Required]** Gets the properties of this OntologyGraphPreviewNode.

        :return: The properties of this OntologyGraphPreviewNode.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphPreviewProperty]
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this OntologyGraphPreviewNode.

        :param properties: The properties of this OntologyGraphPreviewNode.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphPreviewProperty]
        """
        self._properties = properties

    @property
    def kind(self):
        """
        Gets the kind of this OntologyGraphPreviewNode.

        :return: The kind of this OntologyGraphPreviewNode.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """
        Sets the kind of this OntologyGraphPreviewNode.

        :param kind: The kind of this OntologyGraphPreviewNode.
        :type: str
        """
        self._kind = kind

    @property
    def expansion(self):
        """
        Gets the expansion of this OntologyGraphPreviewNode.

        :return: The expansion of this OntologyGraphPreviewNode.
        :rtype: oci.aidataplatform_dp.models.OntologyGraphPreviewNodeExpansion
        """
        return self._expansion

    @expansion.setter
    def expansion(self, expansion):
        """
        Sets the expansion of this OntologyGraphPreviewNode.

        :param expansion: The expansion of this OntologyGraphPreviewNode.
        :type: oci.aidataplatform_dp.models.OntologyGraphPreviewNodeExpansion
        """
        self._expansion = expansion

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
