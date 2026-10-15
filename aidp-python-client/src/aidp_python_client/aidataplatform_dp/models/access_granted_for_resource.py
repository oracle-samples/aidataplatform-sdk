# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForResource(object):
    """
    Lakeproxy resource selected by resourceType.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForResource object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForMasterCatalogResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForTableResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForFileResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForWorkspaceResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForCatalogResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForVolumeResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForDeltaShareResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForDatabaseResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForKnowledgeBaseResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForDatalakeResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForExternalCatalogResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForComputeResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForWorkflowResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForFolderResource`
        * :class:`~oci.aidataplatform_dp.models.AccessGrantedForCredentialResource`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param resource_type:
            The value to assign to the resource_type property of this AccessGrantedForResource.
        :type resource_type: str

        """
        self.swagger_types = {
            'resource_type': 'str'
        }
        self.attribute_map = {
            'resource_type': 'resourceType'
        }
        self._resource_type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['resourceType']

        if type == 'CENTRIFYCATALOG':
            return 'AccessGrantedForMasterCatalogResource'

        if type == 'TABLE':
            return 'AccessGrantedForTableResource'

        if type == 'FILE':
            return 'AccessGrantedForFileResource'

        if type == 'WORKSPACE':
            return 'AccessGrantedForWorkspaceResource'

        if type == 'CATALOG':
            return 'AccessGrantedForCatalogResource'

        if type == 'VOLUME':
            return 'AccessGrantedForVolumeResource'

        if type == 'DELTASHARE':
            return 'AccessGrantedForDeltaShareResource'

        if type == 'DATABASE':
            return 'AccessGrantedForDatabaseResource'

        if type == 'KNOWLEDGE_BASE':
            return 'AccessGrantedForKnowledgeBaseResource'

        if type == 'DATALAKE':
            return 'AccessGrantedForDatalakeResource'

        if type == 'EXTERNALCATALOG':
            return 'AccessGrantedForExternalCatalogResource'

        if type == 'COMPUTE':
            return 'AccessGrantedForComputeResource'

        if type == 'WORKFLOW':
            return 'AccessGrantedForWorkflowResource'

        if type == 'FOLDER':
            return 'AccessGrantedForFolderResource'

        if type == 'CREDENTIAL':
            return 'AccessGrantedForCredentialResource'
        else:
            return 'AccessGrantedForResource'

    @property
    def resource_type(self):
        """
        **[Required]** Gets the resource_type of this AccessGrantedForResource.
        Lakeproxy resource discriminator.


        :return: The resource_type of this AccessGrantedForResource.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type):
        """
        Sets the resource_type of this AccessGrantedForResource.
        Lakeproxy resource discriminator.


        :param resource_type: The resource_type of this AccessGrantedForResource.
        :type: str
        """
        self._resource_type = resource_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
