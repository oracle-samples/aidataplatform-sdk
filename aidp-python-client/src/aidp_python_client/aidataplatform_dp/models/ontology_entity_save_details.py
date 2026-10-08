# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntitySaveDetails(object):
    """
    Ordered transaction envelope for ontology entity save and autosave.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntitySaveDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param project_id:
            The value to assign to the project_id property of this OntologyEntitySaveDetails.
        :type project_id: str

        :param base_revision:
            The value to assign to the base_revision property of this OntologyEntitySaveDetails.
        :type base_revision: str

        :param client_mutation_id:
            The value to assign to the client_mutation_id property of this OntologyEntitySaveDetails.
        :type client_mutation_id: str

        :param mode:
            The value to assign to the mode property of this OntologyEntitySaveDetails.
        :type mode: str

        :param operations:
            The value to assign to the operations property of this OntologyEntitySaveDetails.
        :type operations: list[oci.aidataplatform_dp.models.OntologyEntitySaveOperation]

        """
        self.swagger_types = {
            'project_id': 'str',
            'base_revision': 'str',
            'client_mutation_id': 'str',
            'mode': 'str',
            'operations': 'list[OntologyEntitySaveOperation]'
        }

        self.attribute_map = {
            'project_id': 'projectId',
            'base_revision': 'baseRevision',
            'client_mutation_id': 'clientMutationId',
            'mode': 'mode',
            'operations': 'operations'
        }

        self._project_id = None
        self._base_revision = None
        self._client_mutation_id = None
        self._mode = None
        self._operations = None

    @property
    def project_id(self):
        """
        Gets the project_id of this OntologyEntitySaveDetails.
        Project being saved. The path projectId is authoritative.


        :return: The project_id of this OntologyEntitySaveDetails.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """
        Sets the project_id of this OntologyEntitySaveDetails.
        Project being saved. The path projectId is authoritative.


        :param project_id: The project_id of this OntologyEntitySaveDetails.
        :type: str
        """
        self._project_id = project_id

    @property
    def base_revision(self):
        """
        **[Required]** Gets the base_revision of this OntologyEntitySaveDetails.
        Server revision the client edited from.


        :return: The base_revision of this OntologyEntitySaveDetails.
        :rtype: str
        """
        return self._base_revision

    @base_revision.setter
    def base_revision(self, base_revision):
        """
        Sets the base_revision of this OntologyEntitySaveDetails.
        Server revision the client edited from.


        :param base_revision: The base_revision of this OntologyEntitySaveDetails.
        :type: str
        """
        self._base_revision = base_revision

    @property
    def client_mutation_id(self):
        """
        **[Required]** Gets the client_mutation_id of this OntologyEntitySaveDetails.
        Unique ID for this save/autosave request, used for retry safety.


        :return: The client_mutation_id of this OntologyEntitySaveDetails.
        :rtype: str
        """
        return self._client_mutation_id

    @client_mutation_id.setter
    def client_mutation_id(self, client_mutation_id):
        """
        Sets the client_mutation_id of this OntologyEntitySaveDetails.
        Unique ID for this save/autosave request, used for retry safety.


        :param client_mutation_id: The client_mutation_id of this OntologyEntitySaveDetails.
        :type: str
        """
        self._client_mutation_id = client_mutation_id

    @property
    def mode(self):
        """
        **[Required]** Gets the mode of this OntologyEntitySaveDetails.
        Save mode. Supported values are save and autosave.


        :return: The mode of this OntologyEntitySaveDetails.
        :rtype: str
        """
        return self._mode

    @mode.setter
    def mode(self, mode):
        """
        Sets the mode of this OntologyEntitySaveDetails.
        Save mode. Supported values are save and autosave.


        :param mode: The mode of this OntologyEntitySaveDetails.
        :type: str
        """
        self._mode = mode

    @property
    def operations(self):
        """
        **[Required]** Gets the operations of this OntologyEntitySaveDetails.
        Ordered list of entity changes to apply atomically.


        :return: The operations of this OntologyEntitySaveDetails.
        :rtype: list[oci.aidataplatform_dp.models.OntologyEntitySaveOperation]
        """
        return self._operations

    @operations.setter
    def operations(self, operations):
        """
        Sets the operations of this OntologyEntitySaveDetails.
        Ordered list of entity changes to apply atomically.


        :param operations: The operations of this OntologyEntitySaveDetails.
        :type: list[oci.aidataplatform_dp.models.OntologyEntitySaveOperation]
        """
        self._operations = operations

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
