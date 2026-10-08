# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntityPatchDetails(object):
    """
    JSON Patch-style request for modifying flat ontology entity properties.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntityPatchDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param entity_type:
            The value to assign to the entity_type property of this OntologyEntityPatchDetails.
        :type entity_type: str

        :param payload:
            The value to assign to the payload property of this OntologyEntityPatchDetails.
        :type payload: list[oci.aidataplatform_dp.models.OntologyEntityPatchOperation]

        """
        self.swagger_types = {
            'entity_type': 'str',
            'payload': 'list[OntologyEntityPatchOperation]'
        }

        self.attribute_map = {
            'entity_type': 'entityType',
            'payload': 'payload'
        }

        self._entity_type = None
        self._payload = None

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this OntologyEntityPatchDetails.
        Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.


        :return: The entity_type of this OntologyEntityPatchDetails.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this OntologyEntityPatchDetails.
        Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.


        :param entity_type: The entity_type of this OntologyEntityPatchDetails.
        :type: str
        """
        self._entity_type = entity_type

    @property
    def payload(self):
        """
        **[Required]** Gets the payload of this OntologyEntityPatchDetails.
        JSON Patch-style operations scoped to flat entity property paths such as /label or /synonyms/0.


        :return: The payload of this OntologyEntityPatchDetails.
        :rtype: list[oci.aidataplatform_dp.models.OntologyEntityPatchOperation]
        """
        return self._payload

    @payload.setter
    def payload(self, payload):
        """
        Sets the payload of this OntologyEntityPatchDetails.
        JSON Patch-style operations scoped to flat entity property paths such as /label or /synonyms/0.


        :param payload: The payload of this OntologyEntityPatchDetails.
        :type: list[oci.aidataplatform_dp.models.OntologyEntityPatchOperation]
        """
        self._payload = payload

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
