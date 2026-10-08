# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntityFailedOperation(object):
    """
    Failed operation details for an unsuccessful save bundle.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntityFailedOperation object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param op_id:
            The value to assign to the op_id property of this OntologyEntityFailedOperation.
        :type op_id: str

        :param op:
            The value to assign to the op property of this OntologyEntityFailedOperation.
        :type op: str

        :param entity_type:
            The value to assign to the entity_type property of this OntologyEntityFailedOperation.
        :type entity_type: str

        :param compact_iri:
            The value to assign to the compact_iri property of this OntologyEntityFailedOperation.
        :type compact_iri: str

        :param iri:
            The value to assign to the iri property of this OntologyEntityFailedOperation.
        :type iri: str

        :param code:
            The value to assign to the code property of this OntologyEntityFailedOperation.
        :type code: str

        :param message:
            The value to assign to the message property of this OntologyEntityFailedOperation.
        :type message: str

        """
        self.swagger_types = {
            'op_id': 'str',
            'op': 'str',
            'entity_type': 'str',
            'compact_iri': 'str',
            'iri': 'str',
            'code': 'str',
            'message': 'str'
        }

        self.attribute_map = {
            'op_id': 'opId',
            'op': 'op',
            'entity_type': 'entityType',
            'compact_iri': 'compactIri',
            'iri': 'iri',
            'code': 'code',
            'message': 'message'
        }

        self._op_id = None
        self._op = None
        self._entity_type = None
        self._compact_iri = None
        self._iri = None
        self._code = None
        self._message = None

    @property
    def op_id(self):
        """
        Gets the op_id of this OntologyEntityFailedOperation.

        :return: The op_id of this OntologyEntityFailedOperation.
        :rtype: str
        """
        return self._op_id

    @op_id.setter
    def op_id(self, op_id):
        """
        Sets the op_id of this OntologyEntityFailedOperation.

        :param op_id: The op_id of this OntologyEntityFailedOperation.
        :type: str
        """
        self._op_id = op_id

    @property
    def op(self):
        """
        Gets the op of this OntologyEntityFailedOperation.

        :return: The op of this OntologyEntityFailedOperation.
        :rtype: str
        """
        return self._op

    @op.setter
    def op(self, op):
        """
        Sets the op of this OntologyEntityFailedOperation.

        :param op: The op of this OntologyEntityFailedOperation.
        :type: str
        """
        self._op = op

    @property
    def entity_type(self):
        """
        Gets the entity_type of this OntologyEntityFailedOperation.

        :return: The entity_type of this OntologyEntityFailedOperation.
        :rtype: str
        """
        return self._entity_type

    @entity_type.setter
    def entity_type(self, entity_type):
        """
        Sets the entity_type of this OntologyEntityFailedOperation.

        :param entity_type: The entity_type of this OntologyEntityFailedOperation.
        :type: str
        """
        self._entity_type = entity_type

    @property
    def compact_iri(self):
        """
        Gets the compact_iri of this OntologyEntityFailedOperation.

        :return: The compact_iri of this OntologyEntityFailedOperation.
        :rtype: str
        """
        return self._compact_iri

    @compact_iri.setter
    def compact_iri(self, compact_iri):
        """
        Sets the compact_iri of this OntologyEntityFailedOperation.

        :param compact_iri: The compact_iri of this OntologyEntityFailedOperation.
        :type: str
        """
        self._compact_iri = compact_iri

    @property
    def iri(self):
        """
        Gets the iri of this OntologyEntityFailedOperation.

        :return: The iri of this OntologyEntityFailedOperation.
        :rtype: str
        """
        return self._iri

    @iri.setter
    def iri(self, iri):
        """
        Sets the iri of this OntologyEntityFailedOperation.

        :param iri: The iri of this OntologyEntityFailedOperation.
        :type: str
        """
        self._iri = iri

    @property
    def code(self):
        """
        Gets the code of this OntologyEntityFailedOperation.

        :return: The code of this OntologyEntityFailedOperation.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this OntologyEntityFailedOperation.

        :param code: The code of this OntologyEntityFailedOperation.
        :type: str
        """
        self._code = code

    @property
    def message(self):
        """
        Gets the message of this OntologyEntityFailedOperation.

        :return: The message of this OntologyEntityFailedOperation.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this OntologyEntityFailedOperation.

        :param message: The message of this OntologyEntityFailedOperation.
        :type: str
        """
        self._message = message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
