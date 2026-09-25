# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntityMutationResult(object):
    """
    Result envelope for a design-time ontology entity mutation.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntityMutationResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param success:
            The value to assign to the success property of this OntologyEntityMutationResult.
        :type success: bool

        :param code:
            The value to assign to the code property of this OntologyEntityMutationResult.
        :type code: int

        :param created_entities:
            The value to assign to the created_entities property of this OntologyEntityMutationResult.
        :type created_entities: list[str]

        :param deleted_entities:
            The value to assign to the deleted_entities property of this OntologyEntityMutationResult.
        :type deleted_entities: list[str]

        :param updated_entities:
            The value to assign to the updated_entities property of this OntologyEntityMutationResult.
        :type updated_entities: list[str]

        :param errors:
            The value to assign to the errors property of this OntologyEntityMutationResult.
        :type errors: list[oci.aidataplatform_dp.models.OntologyEntityError]

        """
        self.swagger_types = {
            'success': 'bool',
            'code': 'int',
            'created_entities': 'list[str]',
            'deleted_entities': 'list[str]',
            'updated_entities': 'list[str]',
            'errors': 'list[OntologyEntityError]'
        }

        self.attribute_map = {
            'success': 'success',
            'code': 'code',
            'created_entities': 'createdEntities',
            'deleted_entities': 'deletedEntities',
            'updated_entities': 'updatedEntities',
            'errors': 'errors'
        }

        self._success = None
        self._code = None
        self._created_entities = None
        self._deleted_entities = None
        self._updated_entities = None
        self._errors = None

    @property
    def success(self):
        """
        **[Required]** Gets the success of this OntologyEntityMutationResult.
        Whether the mutation completed successfully.


        :return: The success of this OntologyEntityMutationResult.
        :rtype: bool
        """
        return self._success

    @success.setter
    def success(self, success):
        """
        Sets the success of this OntologyEntityMutationResult.
        Whether the mutation completed successfully.


        :param success: The success of this OntologyEntityMutationResult.
        :type: bool
        """
        self._success = success

    @property
    def code(self):
        """
        **[Required]** Gets the code of this OntologyEntityMutationResult.
        HTTP-like status code for the mutation result.


        :return: The code of this OntologyEntityMutationResult.
        :rtype: int
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this OntologyEntityMutationResult.
        HTTP-like status code for the mutation result.


        :param code: The code of this OntologyEntityMutationResult.
        :type: int
        """
        self._code = code

    @property
    def created_entities(self):
        """
        Gets the created_entities of this OntologyEntityMutationResult.
        Entity identifiers created by this mutation.


        :return: The created_entities of this OntologyEntityMutationResult.
        :rtype: list[str]
        """
        return self._created_entities

    @created_entities.setter
    def created_entities(self, created_entities):
        """
        Sets the created_entities of this OntologyEntityMutationResult.
        Entity identifiers created by this mutation.


        :param created_entities: The created_entities of this OntologyEntityMutationResult.
        :type: list[str]
        """
        self._created_entities = created_entities

    @property
    def deleted_entities(self):
        """
        Gets the deleted_entities of this OntologyEntityMutationResult.
        Entity identifiers deleted by this mutation.


        :return: The deleted_entities of this OntologyEntityMutationResult.
        :rtype: list[str]
        """
        return self._deleted_entities

    @deleted_entities.setter
    def deleted_entities(self, deleted_entities):
        """
        Sets the deleted_entities of this OntologyEntityMutationResult.
        Entity identifiers deleted by this mutation.


        :param deleted_entities: The deleted_entities of this OntologyEntityMutationResult.
        :type: list[str]
        """
        self._deleted_entities = deleted_entities

    @property
    def updated_entities(self):
        """
        Gets the updated_entities of this OntologyEntityMutationResult.
        Entity identifiers updated by this mutation.


        :return: The updated_entities of this OntologyEntityMutationResult.
        :rtype: list[str]
        """
        return self._updated_entities

    @updated_entities.setter
    def updated_entities(self, updated_entities):
        """
        Sets the updated_entities of this OntologyEntityMutationResult.
        Entity identifiers updated by this mutation.


        :param updated_entities: The updated_entities of this OntologyEntityMutationResult.
        :type: list[str]
        """
        self._updated_entities = updated_entities

    @property
    def errors(self):
        """
        Gets the errors of this OntologyEntityMutationResult.
        Mutation errors when success is false.


        :return: The errors of this OntologyEntityMutationResult.
        :rtype: list[oci.aidataplatform_dp.models.OntologyEntityError]
        """
        return self._errors

    @errors.setter
    def errors(self, errors):
        """
        Sets the errors of this OntologyEntityMutationResult.
        Mutation errors when success is false.


        :param errors: The errors of this OntologyEntityMutationResult.
        :type: list[oci.aidataplatform_dp.models.OntologyEntityError]
        """
        self._errors = errors

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
