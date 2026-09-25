# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntitySaveOperation(object):
    """
    One ordered entity operation inside an ontology save bundle.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntitySaveOperation object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param op_id:
            The value to assign to the op_id property of this OntologyEntitySaveOperation.
        :type op_id: str

        :param op:
            The value to assign to the op property of this OntologyEntitySaveOperation.
        :type op: str

        :param entity_type:
            The value to assign to the entity_type property of this OntologyEntitySaveOperation.
        :type entity_type: str

        :param compact_iri:
            The value to assign to the compact_iri property of this OntologyEntitySaveOperation.
        :type compact_iri: str

        :param iri:
            The value to assign to the iri property of this OntologyEntitySaveOperation.
        :type iri: str

        :param value:
            The value to assign to the value property of this OntologyEntitySaveOperation.
        :type value: object

        :param patches:
            The value to assign to the patches property of this OntologyEntitySaveOperation.
        :type patches: list[oci.aidataplatform_dp.models.OntologyEntityPatchOperation]

        """
        self.swagger_types = {
            'op_id': 'str',
            'op': 'str',
            'entity_type': 'str',
            'compact_iri': 'str',
            'iri': 'str',
            'value': 'object',
            'patches': 'list[OntologyEntityPatchOperation]'
        }

        self.attribute_map = {
            'op_id': 'opId',
            'op': 'op',
            'entity_type': 'entityType',
            'compact_iri': 'compactIri',
            'iri': 'iri',
            'value': 'value',
            'patches': 'patches'
        }

        self._op_id = None
        self._op = None
        self._entity_type = None
        self._compact_iri = None
        self._iri = None
        self._value = None
        self._patches = None

    @property
    def op_id(self):
        """
        **[Required]** Gets the op_id of this OntologyEntitySaveOperation.

        :return: The op_id of this OntologyEntitySaveOperation.
        :rtype: str
        """
        return self._op_id

    @op_id.setter
    def op_id(self, op_id):
        """
        Sets the op_id of this OntologyEntitySaveOperation.

        :param op_id: The op_id of this OntologyEntitySaveOperation.
        :type: str
        """
        self._op_id = op_id

    @property
    def op(self):
        """
        **[Required]** Gets the op of this OntologyEntitySaveOperation.
        Operation type. Supported values are create, replace, patch, and delete.


        :return: The op of this OntologyEntitySaveOperation.
        :rtype: str
        """
        return self._op

    @op.setter
    def op(self, op):
        """
        Sets the op of this OntologyEntitySaveOperation.
        Operation type. Supported values are create, replace, patch, and delete.


        :param op: The op of this OntologyEntitySaveOperation.
        :type: str
        """
        self._op = op

    @property
    def entity_type(self):
        """
        **[Required]** Gets the entity_type of this OntologyEntitySaveOperation.

        :return: The entity_type of this OntologyEntitySaveOperation.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this OntologyEntitySaveOperation.

        :param entity_type: The entity_type of this OntologyEntitySaveOperation.
        :type: str
        """
        self._entity_type = entity_type

    @property
    def compact_iri(self):
        """
        Gets the compact_iri of this OntologyEntitySaveOperation.

        :return: The compact_iri of this OntologyEntitySaveOperation.
        :rtype: str
        """
        return self._compact_iri

    @compact_iri.setter
    def compact_iri(self, compact_iri):
        """
        Sets the compact_iri of this OntologyEntitySaveOperation.

        :param compact_iri: The compact_iri of this OntologyEntitySaveOperation.
        :type: str
        """
        self._compact_iri = compact_iri

    @property
    def iri(self):
        """
        Gets the iri of this OntologyEntitySaveOperation.

        :return: The iri of this OntologyEntitySaveOperation.
        :rtype: str
        """
        return self._iri

    @iri.setter
    def iri(self, iri):
        """
        Sets the iri of this OntologyEntitySaveOperation.

        :param iri: The iri of this OntologyEntitySaveOperation.
        :type: str
        """
        self._iri = iri

    @property
    def value(self):
        """
        Gets the value of this OntologyEntitySaveOperation.
        Full entity value for create or replace operations.


        :return: The value of this OntologyEntitySaveOperation.
        :rtype: object
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this OntologyEntitySaveOperation.
        Full entity value for create or replace operations.


        :param value: The value of this OntologyEntitySaveOperation.
        :type: object
        """
        self._value = value

    @property
    def patches(self):
        """
        Gets the patches of this OntologyEntitySaveOperation.
        JSON Patch operations for patch operations.


        :return: The patches of this OntologyEntitySaveOperation.
        :rtype: list[oci.aidataplatform_dp.models.OntologyEntityPatchOperation]
        """
        return self._patches

    @patches.setter
    def patches(self, patches):
        """
        Sets the patches of this OntologyEntitySaveOperation.
        JSON Patch operations for patch operations.


        :param patches: The patches of this OntologyEntitySaveOperation.
        :type: list[oci.aidataplatform_dp.models.OntologyEntityPatchOperation]
        """
        self._patches = patches

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
