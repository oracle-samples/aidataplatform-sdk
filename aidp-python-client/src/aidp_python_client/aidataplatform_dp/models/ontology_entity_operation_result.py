# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntityOperationResult(object):
    """
    Result for one applied entity operation.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntityOperationResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param op_id:
            The value to assign to the op_id property of this OntologyEntityOperationResult.
        :type op_id: str

        :param entity_type:
            The value to assign to the entity_type property of this OntologyEntityOperationResult.
        :type entity_type: str

        :param compact_iri:
            The value to assign to the compact_iri property of this OntologyEntityOperationResult.
        :type compact_iri: str

        :param iri:
            The value to assign to the iri property of this OntologyEntityOperationResult.
        :type iri: str

        :param status:
            The value to assign to the status property of this OntologyEntityOperationResult.
        :type status: str

        """
        self.swagger_types = {
            'op_id': 'str',
            'entity_type': 'str',
            'compact_iri': 'str',
            'iri': 'str',
            'status': 'str'
        }

        self.attribute_map = {
            'op_id': 'opId',
            'entity_type': 'entityType',
            'compact_iri': 'compactIri',
            'iri': 'iri',
            'status': 'status'
        }

        self._op_id = None
        self._entity_type = None
        self._compact_iri = None
        self._iri = None
        self._status = None

    @property
    def op_id(self):
        """
        Gets the op_id of this OntologyEntityOperationResult.

        :return: The op_id of this OntologyEntityOperationResult.
        :rtype: str
        """
        return self._op_id

    @op_id.setter
    def op_id(self, op_id):
        """
        Sets the op_id of this OntologyEntityOperationResult.

        :param op_id: The op_id of this OntologyEntityOperationResult.
        :type: str
        """
        self._op_id = op_id

    @property
    def entity_type(self):
        """
        Gets the entity_type of this OntologyEntityOperationResult.

        :return: The entity_type of this OntologyEntityOperationResult.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this OntologyEntityOperationResult.

        :param entity_type: The entity_type of this OntologyEntityOperationResult.
        :type: str
        """
        self._entity_type = entity_type

    @property
    def compact_iri(self):
        """
        Gets the compact_iri of this OntologyEntityOperationResult.

        :return: The compact_iri of this OntologyEntityOperationResult.
        :rtype: str
        """
        return self._compact_iri

    @compact_iri.setter
    def compact_iri(self, compact_iri):
        """
        Sets the compact_iri of this OntologyEntityOperationResult.

        :param compact_iri: The compact_iri of this OntologyEntityOperationResult.
        :type: str
        """
        self._compact_iri = compact_iri

    @property
    def iri(self):
        """
        Gets the iri of this OntologyEntityOperationResult.

        :return: The iri of this OntologyEntityOperationResult.
        :rtype: str
        """
        return self._iri

    @iri.setter
    def iri(self, iri):
        """
        Sets the iri of this OntologyEntityOperationResult.

        :param iri: The iri of this OntologyEntityOperationResult.
        :type: str
        """
        self._iri = iri

    @property
    def status(self):
        """
        Gets the status of this OntologyEntityOperationResult.

        :return: The status of this OntologyEntityOperationResult.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this OntologyEntityOperationResult.

        :param status: The status of this OntologyEntityOperationResult.
        :type: str
        """
        self._status = status

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
